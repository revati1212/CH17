package com.java.implement;

import com.java.internal.MachineRepository;
import com.java.internal.MachineService;

public class MachineServiceimp implements MachineService{
private MachineRepository machineRepository;
	
	public MachineServiceimp(MachineRepository machineRepository) {
		this.machineRepository=machineRepository;
		

}

	@Override
	public void save() {
		if(machineRepository != null) {
			System.out.println("Save is not Null");
			machineRepository.save();
		}else {
			System.out.println("Save is Null");
		}	}

	@Override
	public int update() {
		if(machineRepository != null) {
			int version=machineRepository.update();
			if(version >=1) {
				System.out.println("Updated Status:"+version);
				return version;
				
			}
			else {
				System.out.println("update failed");
			}
		}
		return 0;
	}
	

	@Override
	public int delete() {
		if(machineRepository != null) {
			int check=machineRepository.delete();
			if(check >0) {
				System.out.println("Deleted files :"+check);
				return check;
			}
			else {
				System.out.println("Cant deleted");
			}
		}
		return 0;
	}

	@Override
	public int read() {
		if(machineRepository != null) {
			int read=machineRepository.read();
			if(read >=1) {
				System.out.println("Read Status:"+read);
				return read;
			}else {
				System.out.println("Cannot read");
			}
		}
		return 0;
	}

}