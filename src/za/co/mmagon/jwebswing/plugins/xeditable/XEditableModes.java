package za.co.mmagon.jwebswing.plugins.xeditable;

/**
 *
 * @author Marc Magon
 * @since 13 Jun 2017
 */
public enum XEditableModes
{
    Popup, Inline;
    /**
     * Any sub data
     */
    private String data;

    /**
     * A new XEditableModes
     */
    private XEditableModes()
    {

    }

    /**
     * A new XEditableModes with data
     */
    private XEditableModes(String data)
    {

    }

    /**
     * Returns the name or the data contained within
     *
     * @return
     */
    @Override
    public String toString()
    {
        if (data != null && !data.isEmpty())
        {
            return data;
        }
        else
        {
            return name().toLowerCase();
        }
    }
}
