class Twofer {
    String twofer(String name) {
        return String.format("One for %s, one for me.", (name == null || name.equals("")) ? "you" : name);
    }
}
