#! /bin/sh
javac RunCommand.java
python -m http.server --bind 0.0.0.0 8000