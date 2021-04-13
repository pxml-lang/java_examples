<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:output method="html" />

<xsl:template match="/">
<html>
    <head>
        <title>Books</title>
        <style>
            table, th, td {
                border: 1px solid #ddd;
                border-collapse: collapse;
            }
            th, td {
                padding: 0.5em;
            }
        </style>
    </head>

    <body>
        <h2>Books</h2>
        <table>
            <tr><th>ISBN</th><th>Title</th><th>Price</th></tr>
            <xsl:for-each select="books/book">
                <tr>
                    <td><xsl:value-of select="isbn"/></td>
                    <td><xsl:value-of select="title"/></td>
                    <td><xsl:value-of select="price"/></td>
                </tr>
            </xsl:for-each>
        </table>
    </body>
</html>
</xsl:template>

</xsl:stylesheet>
