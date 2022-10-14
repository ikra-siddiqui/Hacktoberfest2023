    int data;  
    struct node *next;  
}*head = NULL;      

struct node *newNode = (struct node*)malloc(sizeof(struct node));
newNode->data = 4;
newNode->next = NULL;

struct node *temp = head;
while(temp->next != NULL){
  temp = temp->next;
}

temp->next = newNode;
