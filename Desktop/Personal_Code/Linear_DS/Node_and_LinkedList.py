class Node: 
    def __init__(self, value, next_node = None):
        self.value = value
        self.next_node = next_node

    def get_node_value(self): 
        return self.value

    def set_next_node(self, next_node):
        self.next_node = next_node

    def get_next_node(self):
        return self.next_node

class LinkedList: 
    #4 methods: init, get head node, insert beginning, stringify, remove a node
    def __init__(self, value = None):
        self.head_node = Node(value)

    def get_head_node(self):
        return self.head_node

    def insert_beginning(self, new_head_value): 
        #1 set a new node
        #2 link the new node with the head node
        #3 set the new node as the head node
        new_node = Node(new_head_value)
        new_node.set_next_node(self.head_node)
        self.head_node = new_node
    
    def stringify(self):
        #1 Create an empty string list
        #2 Create a counter: set it at the head node of the linked list 
        #3 Use the counter to loop through all node: while the counter exists 
        #  if the node the counter is at has a value, append that value to the string list using += 
        #4 Update the counter: getting its next node
        #5 Return the string list 
        string_list = ""
        counter = self.get_head_node()
        while counter: 
            if counter.get_node_value() != None:
                string_list += str(counter.get_node_value())
                counter = counter.get_next_node()
            return string_list
    
    def remove_node(self, value_to_remove): 
        #1 Create a counter: set it at the head node of the linked list 

        #2 Get the value of the counter (head node). 
        #  If this == value to remove -> remove it by setting its next node as the new head node

        #3 Else: Use the counter to loop through all node: while the counter exists
        #  Get the counter's next node. Name it next_node. 
        #  If its next node's value == value to remove, remove it by link the counter(head node)(using set_next_node method) 
        #  to the next node's next node value (using the method get next node)

        #4 Break the while loop by setting counter = None

        #5 Else: Move the counter to the next node 

        counter = self.get_head_node()
        if counter.get_node_value() == value_to_remove:
            self.head_node = counter.get_next_node()
        else: 
            while counter: 
                next_node = counter.get_next_node()
                if next_node.get_node_value() == value_to_remove: 
                    counter.set_next_node(next_node.get_next_node())
                    counter = None
                else: 
                    counter = next_node









    

    

    