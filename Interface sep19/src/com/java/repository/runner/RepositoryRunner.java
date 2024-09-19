package com.java.repository.runner;
import com.java.repository.Repository;
import com.java.repository.Repositorylmpl;
import com.java.service.Serviceimpl;


public class RepositoryRunner {

	public static void main(String[] args) {
 Repository repo=new Repositorylmpl();
 Serviceimpl serve=new Serviceimpl();
 serve.setRepository(repo);
 String save=serve.push();
 System.out.println(save);

	}

}
