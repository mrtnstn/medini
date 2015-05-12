@echo off

rem ---------------------------------------
rem Small wrapper around ant, to avoid local
rem installation and use 3rdParty-ant
rem ---------------------------------------


rem Save old environment
rem ---------------------------------------
setlocal

rem Set extended environment
rem ---------------------------------------
%~d0
cd %~dp0
set IKV_3RDPARTY=%CD%\3rdParty
set ANT_HOME=%IKV_3RDPARTY%\ant
set CLASSPATH=%ANT_HOME%\lib
set PATH=%ANT_HOME%\bin\;%PATH%

rem Call build-script
rem ---------------------------------------
echo Calling: %ANT_HOME%\bin\ant.bat %*
call "%ANT_HOME%\bin\ant.bat" %* 

rem Restore environment
rem ---------------------------------------
endlocal
