package ac.bootcamp.row1game.display;


public final class Sprites {

    // BACKGROUNDS
    final static String CREDITS = "background/background_credits.png";
    final static String GAMEOVER = "background/you_died_background.png";
    final static String GAMEOVERPIC = "background/you_died_picture.png";
    final static String BACKGROUND_1 = "background/bg1.png";
    final static String BACKGROUND_2 = "background/bg2.png";
    final static String BACKGROUND_3 = "background/bg3.png";
    final static String BACKGROUND_4 = "background/bg4.png";
    final static String BACKGROUND_5 = "background/bg5.png";
    final static String INTRO_1 = "background/background_inicial_1.png";
    final static String INTRO_2 = "background/background_inicial_2.png";
    final static String INTRO_3 = "background/background_inicial_3.png";

    final static String[] INTROS = { INTRO_1, INTRO_2, INTRO_3};

    //CRIT
    final static String CRIT = "sprites/critical_hit.png";

    // ACTION BAR
    final static String ACTION_BAR = "sprites/actionBar/action_bar.png";

    // PLAYER
    final static String PLAYER_ATTACK_1 = "sprites/pAttack1.png";
    final static String PLAYER_ATTACK_2 = "sprites/pAttack2.png";

    final static String PLAYER_IDLE_1 = "sprites/player/player_idle_1.png";
    final static String PLAYER_IDLE_2 = "sprites/player/player_idle_2.png";
    final static String PLAYER_IDLE_3 = "sprites/player/player_idle_3.png";
    final static String PLAYER_IDLE_4 = "sprites/player/player_idle_4.png";

    final static String PLAYER_DAMAGE = "sprites/pdamage.png";

    final static String[] PLAYER_DAMAGED = {PLAYER_IDLE_1,PLAYER_DAMAGE,PLAYER_IDLE_1,PLAYER_DAMAGE,PLAYER_IDLE_1,PLAYER_DAMAGE,PLAYER_IDLE_1};


    final static String[] IDLESPRITES = {PLAYER_IDLE_1, PLAYER_IDLE_2, PLAYER_IDLE_3, PLAYER_IDLE_4};
    final static String[] ATTACKSPRITES = {PLAYER_ATTACK_1, PLAYER_ATTACK_2,PLAYER_ATTACK_2, PLAYER_ATTACK_1, PLAYER_IDLE_1};

    // PLAYER ATTACK
    final static String ATTACK_1 = "sprites/pAttackEffect/pA1.png";
    final static String ATTACK_2 = "sprites/pAttackEffect/pA2.png";
    final static String ATTACK_3 = "sprites/pAttackEffect/pA3.png";
    final static String ATTACK_4 = "sprites/pAttackEffect/pA4.png";
    final static String ATTACK_5 = "sprites/pAttackEffect/pA5.png";
    final static String ATTACK_6 = "sprites/pAttackEffect/pA6.png";

    final static String[] ATTACKDONE = {ATTACK_1, ATTACK_2, ATTACK_3, ATTACK_4, ATTACK_5, ATTACK_6};

    // SPELL
    final static String SPELL_1 = "sprites/SpellEffect/spell1.png";
    final static String SPELL_2 = "sprites/SpellEffect/spell2.png";
    final static String SPELL_3 = "sprites/SpellEffect/spell3.png";
    final static String SPELL_4 = "sprites/SpellEffect/spell4.png";
    final static String SPELL_5 = "sprites/SpellEffect/spell5.png";
    final static String SPELL_6 = "sprites/SpellEffect/spell6.png";
    final static String SPELL_7 = "sprites/SpellEffect/spell7.png";
    final static String SPELL_8 = "sprites/SpellEffect/spell8.png";
    final static String SPELL_9 = "sprites/SpellEffect/spell9.png";
    final static String SPELL_10 = "sprites/SpellEffect/spell10.png";

    final static String[] SPELLDONE = {SPELL_1, SPELL_2, SPELL_3, SPELL_4, SPELL_5, SPELL_6, SPELL_7, SPELL_8, SPELL_9, SPELL_10};

    // CHARGING

    final static String CHARGING_1 = "sprites/chargingEffect/charging1.png";
    final static String CHARGING_2 = "sprites/chargingEffect/charging2.png";
    final static String CHARGING_3 = "sprites/chargingEffect/charging3.png";
    final static String CHARGING_4 = "sprites/chargingEffect/charging4.png";

    final static String[] CHARGINGDONE = {CHARGING_1, CHARGING_2, CHARGING_3, CHARGING_4, CHARGING_3, CHARGING_4, CHARGING_3,CHARGING_4,CHARGING_3,CHARGING_2,CHARGING_1 };


    // CHARGED ATTACK
    final static String CHARGE_1 = "sprites/chargedAttack/c1.png";
    final static String CHARGE_2 = "sprites/chargedAttack/c2.png";
    final static String CHARGE_3 = "sprites/chargedAttack/c3.png";
    final static String CHARGE_4 = "sprites/chargedAttack/c4.png";
    final static String CHARGE_5 = "sprites/chargedAttack/c5.png";
    final static String CHARGE_6 = "sprites/chargedAttack/c6.png";
    final static String CHARGE_7 = "sprites/chargedAttack/c7.png";
    final static String CHARGE_8 = "sprites/chargedAttack/c8.png";
    final static String CHARGE_9 = "sprites/chargedAttack/c9.png";

    final static String[] CHARGEDDONE = {CHARGE_1, CHARGE_2, CHARGE_3, CHARGE_4, CHARGE_5, CHARGE_6, CHARGE_5, CHARGE_4, CHARGE_7, CHARGE_8, CHARGE_9};

    // BLOCK
    final static String BLOCK_1 = "sprites/block/block1.png";
    final static String BLOCK_2 = "sprites/block/block2.png";
    final static String BLOCK_3 = "sprites/block/block3.png";
    final static String BLOCK_4 = "sprites/block/block4.png";

    final static String[] BLOCKING = { BLOCK_1, BLOCK_2, BLOCK_3, BLOCK_4, BLOCK_3, BLOCK_2, BLOCK_1};

    // HEAL

    final static String HEAL_1 = "sprites/heal/heal1.png";
    final static String HEAL_2 = "sprites/heal/heal2.png";
    final static String HEAL_3 = "sprites/heal/heal3.png";
    final static String HEAL_4 = "sprites/heal/heal4.png";
    final static String[] HEALING = { HEAL_4, HEAL_3, HEAL_2, HEAL_1, HEAL_2, HEAL_3, HEAL_4};

    // MONSTER A

    final static String MONSTER_A_1 = "sprites/monsterA/monster_a_1.png";
    final static String MONSTER_A_2 = "sprites/monsterA/monster_a_2.png";
    final static String MONSTER_A_3 = "sprites/monsterA/monster_a_3.png";

    final static String[] MONSTER_A_ATK = { MONSTER_A_1, MONSTER_A_2, MONSTER_A_3,MONSTER_A_3, MONSTER_A_2,MONSTER_A_1};

    // MONSTER A DAMAGED

    final static String MONSTER_A_X = "sprites/monsterA/monster_a_x.png";

    final static String[] MONSTER_A_DAMAGED = {MONSTER_A_1,MONSTER_A_X,MONSTER_A_1,MONSTER_A_X,MONSTER_A_1,MONSTER_A_X,MONSTER_A_1};


    // MONSTER B

    final static String MONSTER_B_1 = "sprites/monsterB/monster_b_1.png";
    final static String MONSTER_B_2 = "sprites/monsterB/monster_b_2.png";

    final static  String[] MONSTER_B_ATK = {MONSTER_B_1,MONSTER_B_2,MONSTER_B_2,MONSTER_B_1,MONSTER_B_1,MONSTER_B_2,MONSTER_B_2,MONSTER_B_1};

    // MONSTER B DAMAGED

    final static String MONSTER_B_X = "sprites/monsterB/monster_b_x.png";

    final static String[] MONSTER_B_DAMAGED = {MONSTER_B_1,MONSTER_B_X,MONSTER_B_1,MONSTER_B_X,MONSTER_B_1,MONSTER_B_X,MONSTER_B_1};

    // MONSTER C
    final static String MONSTER_C_1 = "sprites/monsterC/monster_c_1.png";
    final static String MONSTER_C_2 = "sprites/monsterC/monster_c_2.png";
    final static String MONSTER_C_3 = "sprites/monsterC/monster_c_3.png";

    final static String[] MONSTER_C_ATK = { MONSTER_C_1, MONSTER_C_2, MONSTER_C_3,MONSTER_C_3, MONSTER_C_2,MONSTER_C_1};

    // MONSTER C DAMAGED
    final static String MONSTER_C_X = "sprites/monsterC/monster_c_x.png";

    final static String[] MONSTER_C_DAMAGED = {MONSTER_C_1,MONSTER_C_X,MONSTER_C_1,MONSTER_C_X,MONSTER_C_1,MONSTER_C_X,MONSTER_C_1};


    // MONSTER D
    final static String MONSTER_D_1 = "sprites/monsterD/monster_d_1.png";
    final static String MONSTER_D_2 = "sprites/monsterD/monster_d_2.png";
    final static String MONSTER_D_3 = "sprites/monsterD/monster_d_3.png";

    final static String[] MONSTER_D_ATK = { MONSTER_D_1, MONSTER_D_2, MONSTER_D_3,MONSTER_D_3, MONSTER_D_2,MONSTER_D_1};

    // MONSTER D DAMAGED
    final static String MONSTER_D_X = "sprites/monsterD/monster_d_x.png";

    final static String[] MONSTER_D_DAMAGED = {MONSTER_D_1,MONSTER_D_X,MONSTER_D_1,MONSTER_D_X,MONSTER_D_1,MONSTER_D_X,MONSTER_D_1};

    // MONSTER ATTACK
    final static String M_ATTACK_1 = "sprites/mAttackEffect/mA1.png";
    final static String M_ATTACK_2 = "sprites/mAttackEffect/mA2.png";
    final static String M_ATTACK_3 = "sprites/mAttackEffect/mA3.png";
    final static String M_ATTACK_4 = "sprites/mAttackEffect/mA4.png";
    final static String M_ATTACK_5 = "sprites/mAttackEffect/mA5.png";
    final static String M_ATTACK_6 = "sprites/mAttackEffect/mA6.png";

    final static String[] M_ATTACKDONE = {M_ATTACK_1, M_ATTACK_2, M_ATTACK_3, M_ATTACK_4, M_ATTACK_5, M_ATTACK_6};


}
