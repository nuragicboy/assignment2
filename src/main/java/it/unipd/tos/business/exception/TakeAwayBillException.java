////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class TakeAwayBillException extends Exception {
    private static final long serialVersionUID = 1L;

    public TakeAwayBillException(String errMsg) {
        super(errMsg);
    }
}