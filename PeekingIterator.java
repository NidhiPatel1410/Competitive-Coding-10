// In this approach, we are doing iterator.nexxt initially and storing the value of it in curr variable, so now whenever peek is 
// called, we simply return the curr and dont move our pointer, and when next is called, we return curr and we also update our
// pointer, i.e update current to next element now. 

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer curr;
    Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext()) {
            this.curr = iterator.next();
        }

    }

    // Returns the next element in the iteration without advancing the iterator, we
    // have that stored in curr
    public Integer peek() {
        return curr;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        // Store the value to be returned
        int old = curr;
        // Now if there is next value, move the pointer and update current
        if (iterator.hasNext()) {
            curr = iterator.next();
        } else {
            curr = null;
        }
        // Return that old value
        return old;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }
}