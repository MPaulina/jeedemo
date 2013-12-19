#!/bin/bash

if [ -d .git ]; 
        then
        echo 'Set comment: '
        read commit
        
        if [  -e .gitignore ];
        then
                rm .gitignore
                echo '.gitignore removed'
        fi
        git add *
        git commit -m "$commit"
        git push
        
else
        echo 'Set repo name: '
        read repo
        git init
        if [  -e .gitignore ];
        then    
                rm .gitignore
                echo '.gitignore removed'
        fi
        echo 'Set comment: '
        read commit
        git add *
        git commit -m "$commit"
        git remote add origin https://github.com/MPaulina/$repo.git
        git push origin master
fi

echo ''        
echo 'Thank you for using the script. I hope that it turned out to be useful.'
echo '****Copyright (c) 2013 (-:Henio:-). All rights reserved.****'
