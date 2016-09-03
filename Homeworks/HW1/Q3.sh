cat readme.txt | xargs -n1 | sort | uniq -c > newtext
