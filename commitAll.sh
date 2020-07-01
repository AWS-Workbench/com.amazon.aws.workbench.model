#!/bin/sh

git add . 
git commit -m "$1"
git push origin master


cd ../com.amazon.aws.workbench.model.edit


git add . 
git commit -m "$1"
git push origin master

cd ../com.amazon.aws.workbench.model.editor

git add . 
git commit -m "$1"
git push origin master
