#!/bin/bash

STARTDIR="$(pwd)"
cd "$(dirname "$0")"
BASEDIR="$(pwd)"
echo
echo "********************* ALL Passing Cases *********************"
cd "${STARTDIR}/tests/passing"
for f in *.488; do
    echo "^^^^^Processing $f^^^^^"
    java -jar "${BASEDIR}/dist/compiler488.jar" "$f";
    echo
done


echo "********************* ALL Failing Cases *********************"
cd "${STARTDIR}/tests/failing"
for f in *.488; do
    echo "^^^^^Processing $f^^^^^"
    java -jar "${BASEDIR}/dist/compiler488.jar" "$f";
    echo
done
