class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> startCities = new HashSet<>();

        // Store all starting cities
        for (List<String> path : paths) {
            startCities.add(path.get(0));
        }

        // Find the city that is never a starting city
        for (List<String> path : paths) {
            if (!startCities.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return "";
    }
}