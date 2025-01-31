

https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html




Computer users take it for granted that their systems can do more than one thing at a time. 
They assume that they can continue to work in a word processor, while other applications download files, 
manage the print queue, and stream audio. Even a single application is often expected to do more than one thing at a time. 

For example, that streaming audio application must simultaneously read the digital audio off the network, 
decompress it, manage playback, and update its display. 

Even the word processor should always be ready to respond to keyboard and mouse events, no matter how busy it is 
reformatting text or updating the display. Software that can do such things is known as concurrent software.


The Java platform is designed from the ground up to support concurrent programming, 
with basic concurrency support in the Java programming language and the Java class libraries. 

Since version 5.0, the Java platform has also included high-level concurrency APIs. 

This lesson introduces the platform's basic concurrency support and summarizes some of the high-level APIs 
in the java.util.concurrent packages.
