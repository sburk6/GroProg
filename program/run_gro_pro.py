import sys
import os
import subprocess

baseDir = os.path.dirname(os.path.abspath(__file__))    # Path of this script
args = ['java', '-jar', baseDir + os.path.normpath('/.program/gro_pro.jar')]
args.extend(sys.argv[1:])   # Pass all parameters along to the jar except the filename of this script (run_gro_pro.py)
subprocess.call(args)
