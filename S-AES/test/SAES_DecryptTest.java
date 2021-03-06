/** Copyright 2014 Noel Niles
 * 
 * This file is part of SAES.
 *
 * S-AES is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
import org.junit.Test;
import static org.junit.Assert.*;

/** S-AES Decryption Tests.
 *
 * Various functions used to encrypt by S-AES
 * 
 * @author Noel Niles
 * @version 1.0
 * @since 2014-10-28
 ******************************************************************************/
public class SAES_DecryptTest {
    
    public SAES_DecryptTest() {
    }
    
    @Test
    public void SAES_DecryptionRoundTest(){
        short cipherText = 0x0738;
        byte[][] key = {{0xa, 0x7}, {0x3, 0xb}};
        short expResult = 0x6f6b;
        short result = SAES_Decrypt.SAES_DecryptionRound(cipherText, key);
        assertEquals(expResult, result);
    }
}
