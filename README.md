# TsFile Document
<pre>
___________    ___________.__.__          
\__    ___/____\_   _____/|__|  |   ____  
  |    | /  ___/|    __)  |  |  | _/ __ \ 
  |    | \___ \ |     \   |  |  |_\  ___/ 
  |____|/____  >\___  /   |__|____/\___  >  version 0.5.0
             \/     \/                 \/  
</pre>

## Status
[![Build Status](https://travis-ci.org/thulab/tsfile.svg?branch=master)](https://travis-ci.org/thulab/tsfile)

## Abstract

TsFile is a columnar storage file format designed for time series data, which supports efficient compression and query. It is easy to integrate TsFile into your IoT big data processing frameworks.


## Motivation

Nowadays, the implementation of IoT is becoming increasingly popular in areas such as Industry 4.0, Smart Home, wearables and Connected Healthcare. Comparing with traditional IT infrastructure usage monitoring scenarios, applications like intelligent control and alarm reporting stimulate more advanced analytics requirements on time series data generated by sensors. Especially when IoT dives into industrial Internet, intelligent equipments produce one to two orders of magnitudes of data more than consumer-oriented IoT, where analytics comes more complicated to get actionable insights. As an illustrative example, a single wind turbine can generate hundreds of data points every 20 ms for fault detection or prediction through a set of sophisticated operations against time series by data scientists, such as signal decomposition and filtration, segmentation for varied working conditions, pattern matching, frequency domain analysis etc..

Recent advances in time series data management system are developed for data center monitoring. Currently there is not a file format optimized specifically for time series data in above scenarios. So TsFile was born. TsFile is a specially designed file format rather than a database. Users can open, write, read, and close a TsFile easily like doing operations on a normal file. Besides, more interfaces are available on a TsFile.

The target of TsFile project is to support: high ingestion rate up to tens of million data points per second and rare updates only for the correction of low quality data; compact data packaging and deep compression for long-live historical data; traditional sequential and conditional query, complex exploratory query, signal processing, data mining and machine learning.

The features of TsFile is as follow:

* **Write**
	* Fast data import
	* Efficiently compression
	* diverse data encoding types
* **Read**
	* Efficiently query 
	* Time-sorted query data set
* **Integration**
	* HDFS
	* Spark and Hive
	* etc. 

## Online Documents
* [Installation](https://github.com/thulab/tsfile/wiki/Installation)
* [Get Started](https://github.com/thulab/tsfile/wiki/Get-Started)
* [TsFile-Spark Connector](https://github.com/thulab/tsfile/wiki/TsFile-Spark-Connector)

 
