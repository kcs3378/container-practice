#!/bin/sh

# Nginx를 백그라운드에서 실행
nginx -g "daemon off;" &

# npm
npm start
