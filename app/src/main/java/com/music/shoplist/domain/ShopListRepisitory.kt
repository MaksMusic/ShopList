package com.music.shoplist.domain

interface ShopListRepisitory {
    fun addShopItem(shopItem: ShopItem)
    fun deleteItem (shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem?)
    fun getShopItem(shopItemId:Int) :ShopItem?
    fun getShopList() : List<ShopItem>
}