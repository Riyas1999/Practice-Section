#!/bin/sh

echo "enter a number"
read number

if [expr $number % 2 == 0 ];
then
echo "even number"

else
echo "odd number"
fi