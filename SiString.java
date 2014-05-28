/*************************  SiString.java  *********************/

interface SiString
{
    public boolean equals(SiString s);
    
    public boolean subEquals(int offset, int bits, SiString s);

    public int misMatch(int offset, SiString s);

    public int extractBits(int offset, int bits);

    public int compareTo(SiString s);
}