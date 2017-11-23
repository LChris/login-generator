package geco;

import java.util.Random;

/**
 * Class représentant un generateur de mot de passe
 */
public class PasswordGeneration {
    private static final int PASSWORD_SIZE = 8;

    /**
     * Genere un mot de passe aléatoire de 8 charactères
     *
     * @return le mot de passe aleatoire
     */
    public String getRandomPassword() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < PASSWORD_SIZE; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }

        return sb.toString();
    }
}
