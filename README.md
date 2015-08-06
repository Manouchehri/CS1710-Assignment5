# CS1710 - Assignment 5

## Overview

Answers to "Part I: Tracing" can be found in `PartI/*.txt` or `PartI/*.md`.

Answers to "Part II: Programming Exercises" can be found in `PartII/src/*.java`.

*Note: An updated .zip can always be found at [GitHub](https://github.com/Manouchehri/CS1710-Assignment5/archive/master.zip).*

## Exporting

To export to a .zip from the repository, run the following.

`rm -i *.zip; git gc --aggressive --prune=now && git archive HEAD --format=zip -9 > "$(printf "r%s.%s - %s - %s.zip" "$(git rev-list --count HEAD)" "$(git rev-parse --short HEAD)" "$(TZ='Canada/Newfoundland' date --iso-8601=seconds)" "$(git --no-pager show -s --format='%an' HEAD)" | sed s/:/./g)"`

*Warning: This will try to remove all zip files, regardless of name.*