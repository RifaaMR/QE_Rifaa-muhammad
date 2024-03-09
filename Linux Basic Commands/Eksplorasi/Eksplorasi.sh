#!/bin/bash

echo "Enter post title: "
read title

echo "Enter post body: "
read body

echo "Enter user ID: "
read userId

Json="{\"title\":\"$title\", \"body\":\"$body\", \"userId\":$userId}"

response=$(curl -s -X POST -H "Content-Type: application/json" -d "$Json" https://jsonplaceholder.typicode.com/posts)

echo "Sending request.."

echo "Done!"
echo "$response"