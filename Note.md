# Report 1
### Author Madusha Rajapaksha

## 1. Starting Spring Boot Application

      Start a New Project :- Click the file option of Spring Boot Application and select New. Then select spring starter project option. Then you can see a window like forum. First give the name for our project and there are  some fields to choose type projet and java version. You can keep that fields by default. Then we have to create group name. In this case, We should create like this (com.madusha). Then click the next and you can see there is a another window. Select version as 2.1.2. Then choose the web option (you can search this also) and put the SQL option as H2. Then you can click the finsh button.
    

## 2. Terminal Commands for GIT


Git task |Notes| Command|
---|---|---|
Create a new local repository||git init|
Check out a repository|Creating a workig copy of a local repository|git clone /path/to/repository|
||for a remote server,use|git clone username@host:/path/to/repository|
Add files|Add one or more files|git add < File name >
||Add All files|git add .
Commit|Commit changes to head(but not yet to remote repository)|git commit -m "Message"|    
||Commit any files you have added with `git add` and also commit any files you have changed since then.|git commit -a|
|push|Send changes to the master branch of your remote repository|git push origin master|
|status|List the files you've changed and those you still need to add or commit|git status|
|Connect to a remote repository|If you haven't connected your local repository to a remote server, add the server to be able to push to it|git remote add origin < server >|
||List all currently configured remote repositories|git remote -v|
|Branches|Create a new branch and switch to it|git checkout -b < branchname >|
||Switch from one branch to another|git checkout < branchname >|
||List all the branches in your repo, and also tell you what branch you're currently in|git branch|
||Delete the feature branch|git branch -d < branchname >|
||Push the branch to your remote repository, so others can use it|git push origin < branchname >|
||Push all branches to your remote repository|git push --all origin|
||Delete a branch on your remote repository|git push origin :< branchname >|
|Update from the remote repository|Fetch and merge changes on the remote server to your working directory|git pull|
||To merge a different branch into your active branch|git merge < branchname >|
||After you have manually resolved any conflicts, you mark the changed file|git add < filename >|
|Tags|You can use tagging to mark a significant changeset, such as a release|git tag 1.0.0 < commitID >|
||CommitId is the leading characters of the changeset ID, up to 10, but must be unique. Get the ID using|git log|
||Push all tags to remote repository|git push --tags origin|
|Undo local changes|If you mess up, you can replace the changes in your working tree with the last content in head Changes already added to the index, as well as new files, will be kept.|git checkout -- < filename >|
||Instead, to drop all your local changes and commits, fetch the latest history from the server and point your local master branch at it, do this|git fetch origin|
|||git reset --hard origin/master|
|Search|Search the working directory for foo()|git grep "foo()"|
|||


**Using this commands we can can connetc between our local server and remote server.**


## 3. Print name by different different pages

```java

package com.madusha.spring.romeo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	
	@RequestMapping("/randika")
	public String randika() {
		System.out.println("Hello Madusha");
		return "Hello Madusha";
	}

	@RequestMapping("/")
	public String hello() {
		System.out.println("Hello World");
		return "Hello Worlds";
	}
	
	@RequestMapping("/randika/madusha")
	public int hi() {
		System.out.println("Hello");
		
		int x=50;
		int y=20;
		
		int z = x+y;
		return z;
	}

	
}

```

### When we request our server by http://localhost:8080/randika/madusha 

## The output is : *Figure 1*
![Figure 1](desktop/1.png)

### When we request our server by http://localhost:8080/

## The output is : *Figure 2*
![Figure 2](desktop/2.png)

### When we request our server by http://localhost:8080/randika/madusha 

## The output is : *Figure 3*
![Figure 3](desktop/3.png)




## 3. Spring Dev Tools



    Spring Boot includes an additional set of tools that can make the application development experience a little more pleasant. The spring-boot-devtools module can be included in any project to provide additional development-time features. To include devtools support, add the module dependency to your build, as shown in the following listings for Maven and Gradle.

MAVEN code,    

```xml

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-devtools</artifactId>
    <version>2.0.0 RELEASE</version>
</dependency>

```
But that version didn't compare with our spring boot version. Therefore we erase that version tag. Like this.

```xml

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-devtools</artifactId>
</dependency>

```

### Importance of Dev Tools :-

    - Automatic Restart
    - Live Reload
    - Global Settings
    - Remote Applications
          - Remote Debugging via HTTP (Remote Debug Tunnel)
          - Remote Update
    - Conclusion


