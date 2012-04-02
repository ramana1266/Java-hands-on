/**
  
int sumify(Node node){
if(node == null)
return 0;
else{
int tmp = node.data;
node.data = sumify(node.left)+sumify(node+right);
return node.data+tmp; //corrected this
}
}

*/