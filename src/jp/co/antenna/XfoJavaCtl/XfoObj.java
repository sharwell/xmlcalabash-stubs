package jp.co.antenna.XfoJavaCtl;

import java.io.InputStream;
import java.io.OutputStream;

public class XfoObj {

    public static final int S_EST_NONE = 0;
    public static final int S_EST_STDERR = 2;
    public static final int S_EST_STDOUT = 1;
    public static final int S_FORMATTERTYPE_AUTO = 0;
    public static final int S_FORMATTERTYPE_HTML = 1;
    public static final int S_FORMATTERTYPE_XHTML = 2;
    public static final int S_FORMATTERTYPE_XMLCSS = 3;
    public static final int S_FORMATTERTYPE_XSLFO = 4;
    public static final int S_INX_OUTPUTMODE_BLOCK = 2;
    public static final int S_INX_OUTPUTMODE_LINE = 1;
    public static final int S_INX_OUTPUTMODE_TEXT = 0;
    public static final int S_MIF_IMAGEPROCMODE_EMBED = 0;
    public static final int S_MIF_IMAGEPROCMODE_LINK = 1;
    public static final int S_MIF_OUTPUTMODE_BLOCK = 2;
    public static final int S_MIF_OUTPUTMODE_LINE = 1;
    public static final int S_MIF_OUTPUTMODE_TEXT = 0;
    public static final int S_PDF_EMBALLFONT_ALL = 1;
    public static final int S_PDF_EMBALLFONT_BASE14 = 2;
    public static final int S_PDF_EMBALLFONT_PART = 0;
    public static final int S_PDF_ENCLEVEL_128 = 1;
    public static final int S_PDF_ENCLEVEL_128AES = 2;
    public static final int S_PDF_ENCLEVEL_128RC4 = 1;
    public static final int S_PDF_ENCLEVEL_256AES = 3;
    public static final int S_PDF_ENCLEVEL_40 = 0;
    public static final int S_PDF_ENCLEVEL_40RC4 = 0;
    public static final int S_PDF_IMGCMPR_AUTO = 0;
    public static final int S_PDF_IMGCMPR_JPEG = 1;
    public static final int S_PDF_IMGCMPR_JPEG2K = 3;
    public static final int S_PDF_IMGCMPR_ZLIB = 2;
    public static final int S_PDF_IMGDOWNSAMPLING_AVERAGE = 1;
    public static final int S_PDF_IMGDOWNSAMPLING_BICUBIC = 2;
    public static final int S_PDF_IMGDOWNSAMPLING_NONE = 0;
    public static final int S_PDF_IMGDOWNSAMPLING_SUBSAMPLING = 3;
    public static final int S_PDF_MONOCMPR_CCITT3 = 1;
    public static final int S_PDF_MONOCMPR_CCITT4 = 0;
    public static final int S_PDF_MONOCMPR_OFF = 4;
    public static final int S_PDF_MONOCMPR_RUNLENGTH = 2;
    public static final int S_PDF_MONOCMPR_ZLIB = 3;
    public static final int S_PDF_PRALLOW_HIGH = 2;
    public static final int S_PDF_PRALLOW_LOW = 1;
    public static final int S_PDF_PRALLOW_NONE = 0;
    public static final int S_PDF_RGBCONV_ALL = 3;
    public static final int S_PDF_RGBCONV_BLACK = 1;
    public static final int S_PDF_RGBCONV_GRAY = 2;
    public static final int S_PDF_RGBCONV_NONE = 0;
    public static final int S_PDF_VERSION_13 = 0;
    public static final int S_PDF_VERSION_14 = 1;
    public static final int S_PDF_VERSION_15 = 2;
    public static final int S_PDF_VERSION_16 = 3;
    public static final int S_PDF_VERSION_17 = 4;
    public static final int S_PDF_VERSION_A_1a_2005 = 200;
    public static final int S_PDF_VERSION_A_1b_2005 = 400;
    public static final int S_PDF_VERSION_X_1a_2001 = 101;
    public static final int S_PDF_VERSION_X_1a_2003 = 104;
    public static final int S_PDF_VERSION_X_2_2003 = 105;
    public static final int S_PDF_VERSION_X_3_2002 = 103;
    public static final int S_PDF_VERSION_X_3_2003 = 106;
    public static final int S_SVG_IMGCNV_AUTO = 0;
    public static final int S_SVG_IMGCNV_JPEG = 1;
    public static final int S_SVG_IMGCNV_PNG = 2;
    public static final int S_SVG_IMGDOWNSAMPLING_AVERAGE = 1;
    public static final int S_SVG_IMGDOWNSAMPLING_BICUBIC = 2;
    public static final int S_SVG_IMGDOWNSAMPLING_SUBSAMPLING = 3;
    public static final int S_SVG_IMGPT_COPY = 3;
    public static final int S_SVG_IMGPT_COPY_ALL = 1;
    public static final int S_SVG_IMGPT_EMBED_ALL = 0;
    public static final int S_SVG_IMGPT_LINK = 2;
    public static final int S_SVG_VERSION_11 = 0;
    public static final int S_SVG_VERSION_BASIC = 1;
    public static final int S_SVG_VERSION_TINY = 2;

    public void setFormatterType(int formatterType) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setMessageListener(MessageListener listener) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setOptionFileURI(String path) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setExitLevel(int level) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfEmbedAllFontsEx(int newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfImageCompression(int newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfNoAccessibility(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfNoAddingOrChangingComments(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfNoAssembleDoc(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfNoChanging(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfNoContentCopying(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfNoFillForm(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfNoPrinting(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setPdfOwnerPassword(String newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setTwoPassFormatting(boolean newVal) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void setStylesheetURI(String uri) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void addUserStylesheetURI(String uri) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void render(InputStream xmlSrc, InputStream xslSrc, OutputStream dst, String outDevice) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void render(InputStream src, OutputStream dst, String outDevice) throws XfoException {
        throw new UnsupportedOperationException();
    }

    public void releaseObjectEx() throws XfoException {
        throw new UnsupportedOperationException();
    }

}
