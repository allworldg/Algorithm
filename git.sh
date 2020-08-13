# 为了快捷提交
git add .
echo "please input commit message"
read message
git commit -m "$message"
git push github master