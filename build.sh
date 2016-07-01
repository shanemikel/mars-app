#!/bin/bash

packr=http://bit.ly/packrgdx
openjdk=https://bitbucket.org/alexkasko/openjdk-unofficial-builds/downloads/openjdk-1.7.0-u80-unofficial-macosx-x86_64-bundle.zip
mars=http://courses.missouristate.edu/KenVollmar/MARS/MARS_4_5_Aug2014/Mars4_5.jar

wget "$packr" -O packr.jar && \
wget "$openjdk" -O openjdk.zip && \
wget "$mars" -O mars.jar && \
java -jar packr.jar mars-app.json
