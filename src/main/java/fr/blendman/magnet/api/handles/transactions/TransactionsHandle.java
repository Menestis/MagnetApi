package fr.blendman.magnet.api.handles.transactions;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Blendman974
 */
public interface TransactionsHandle {
    CompletableFuture<Boolean> transaction(UUID uuid, int currency, int premium_currency);

    CompletableFuture<Boolean> inventoryTransaction(UUID uuid, String item, int operation);
}
