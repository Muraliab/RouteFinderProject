Project Name : RouteFinder

Identify the route existence between source and destination cities. read the input files which contains cities in a line with comma separated
process the file store the data in to list and process it with given input values to identify the route

Getting Started
	These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

Prerequisites
	Window XP or more OS Version
	Eclipse or Other JDK support IDES
	JDK 1.7 or greater
	Maven 3.x or greater
	

Step by step to setup
	download the zip file and unzip in specifiy drive in local system
	check the JDK installed version in local system if it's greater than 1.7 go ahead for next step or else download 1.7 version and install 
	download eclipse or intelliJ IDES
	run eclipse or IntelliJ
	export unzip project to your workspace
	check configuration of Maven, if not setup Maven configuration
	Run maven import on the imported project
	Make it compilation free
	Run the RoutesServerApplication.java(Spring boot application)
	check the console of loggers. and logger file will generate in project root directory

Test the funcationality
	Test RestAPI : http://localhost:1234/RouteFinder/login 
	check whether your getting out pur or not
	if it works user below user to check the remaining funcationality
	Open browser go to the URL : http://localhost:1234/RouteFinder/findRoute?source=cityname&destination=cityname&destination
	run the above url, check the respose
	
	go to the log file and see the all the logger for complete work flow.


	
