/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 2/1/2022
 *   Time: 10:36 AM
 *   File: User.java
 */

package definitions;

import java.util.Objects;
import java.util.Random;

public class User {
    //fields
    private String userName;
    private String firstName;
    private String lastName;
    private int reputationScore;

    // constructor
    public User(String userName, String firstNmae, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.reputationScore = generateRandomReputationScore();
    }
    // getters
    public String getUserName() {
        return userName;
    }
    // setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getReputationScore() {
        return reputationScore;
    }
    public void  setReputationScore(int reputationScore) {
        this.reputationScore = reputationScore;
    }
    // user1.equals(user2) -> boolean null (Default)
    // this -> user1
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return reputationScore == user.reputationScore && Objects.equals(userName, user.userName) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }
    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ",firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", reputationScore=" + reputationScore + '}';
    }
    /**
     * This method generates a random reputation score for the user.
     *
     * @return a random integer for the score.
     */
            private int generateRandomReputationScore() {
                Random random = new Random();
                return Math.abs(random.nextInt()) % 1000;
        }
    }
