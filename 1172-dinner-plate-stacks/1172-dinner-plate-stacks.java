class DinnerPlates {

    List<Stack<Integer>> stacks;
    TreeSet<Integer> available;
    int capacity;

    public DinnerPlates(int capacity) {
        stacks = new ArrayList<>();
        available = new TreeSet<>();
        this.capacity = capacity;
    }

    public void push(int val) {
        if (available.isEmpty()) {
            stacks.add(new Stack<>());
            available.add(stacks.size() - 1);
        }

        int index = available.first();
        stacks.get(index).push(val);

        if (stacks.get(index).size() == capacity) {
            available.remove(index);
        }
    }

    public int pop() {
        while (!stacks.isEmpty() &&
               stacks.get(stacks.size() - 1).isEmpty()) {
            int index = stacks.size() - 1;
            stacks.remove(index);
            available.remove(index);
        }

        if (stacks.isEmpty()) {
            return -1;
        }

        int index = stacks.size() - 1;
        int val = stacks.get(index).pop();
        available.add(index);

        return val;
    }

    public int popAtStack(int index) {
        if (index >= stacks.size() || stacks.get(index).isEmpty()) {
            return -1;
        }

        if (index == stacks.size() - 1) {
            return pop();
        }

        int val = stacks.get(index).pop();
        available.add(index);

        return val;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */