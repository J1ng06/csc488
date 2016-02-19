#!/bin/bash

STARTDIR="$(pwd)"
cd "$(dirname "$0")"
BASEDIR="$(pwd)"
cd "${STARTDIR}"

java -cp "${BASEDIR}/bin/" 'compiler488.experimental.ASTPlayground' "$@"
