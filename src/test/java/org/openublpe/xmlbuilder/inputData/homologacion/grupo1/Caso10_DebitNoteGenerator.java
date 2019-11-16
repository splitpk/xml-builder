package org.openublpe.xmlbuilder.inputData.homologacion.grupo1;

import org.openublpe.xmlbuilder.inputData.DebitNoteInputGenerator;
import org.openublpe.xmlbuilder.models.input.standard.invoice.InvoiceInputModel;
import org.openublpe.xmlbuilder.models.input.standard.note.debitNote.DebitNoteInputModel;

import java.util.Date;

/**
 * Nota de debito de caso 3
 */
public class Caso10_DebitNoteGenerator implements DebitNoteInputGenerator {

    public static DebitNoteInputModel DEBIT_NOTE;

    @Override
    public DebitNoteInputModel getInput() {
        if (DEBIT_NOTE == null) {
            synchronized (this) {
                if (DEBIT_NOTE == null) {

                    DEBIT_NOTE = new DebitNoteInputModel();

                    DEBIT_NOTE.setSerie("FF11");
                    DEBIT_NOTE.setNumero(2);
                    DEBIT_NOTE.setFechaEmision(new Date().getTime());

                    // Get invoice
                    InvoiceInputModel invoice = Caso3_InvoiceGenerator.INVOICE;

                    // Copy
                    DEBIT_NOTE.setFirmante(invoice.getFirmante());
                    DEBIT_NOTE.setProveedor(invoice.getProveedor());
                    DEBIT_NOTE.setCliente(invoice.getCliente());
                    DEBIT_NOTE.setDetalle(invoice.getDetalle());

                    DEBIT_NOTE.setSerieNumeroInvoiceReference(invoice.getSerie() + "-" + invoice.getNumero());
                    DEBIT_NOTE.setDescripcionSustentoInvoiceReference("mi descripcion o sustento");
                }
            }
        }

        return DEBIT_NOTE;
    }

}