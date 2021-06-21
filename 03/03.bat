@echo off
kotlin _03Kt %1
if (%errorlevel%)==100 (exit /b 100) else (exit /b 0)
